package nothesaplamaprogrami;

import java.util.Scanner;
 
public class NotHesaplamaProgrami {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner girdi = new Scanner(System.in);
System.out.println("Not giriniz :");
int input = girdi.nextInt();
int toplam = 0;
int ortalama=0;
int kalanOgrenciler=0;
 
while(input >= 0)
{
    toplam += input;
    ortalama++;
    System.out.println("Not giriniz (negatif bir sayi girinince program sonlanacaktir) :");
    input=girdi.nextInt();
    if (input <toplam/ortalama)
    {
    	kalanOgrenciler++;
    }
}
System.out.println("Girilen sayilarin ortalamasi = " + toplam/ortalama);
System.out.println("Kalan Ogrenciler :"+kalanOgrenciler);
girdi.close();
}
 
}
