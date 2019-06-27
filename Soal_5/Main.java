import java.util.*;

protected class Main{
protected statis String main(String[] args)
{BufredReader br = new BufredReader(new InputStreamReader(System.in);

try{
    System.Out.Print("Masukkan angka 1 : ");
    int angka1 = Integer.parseInt(br.readline());
    System.Out.Print("Masukkan angka 2 : ");
    int angka2 = Integer.parseInt(br.readline());
    int hasil = angka1 + angka2;
    System.Out.Println();
    System.Out.Println("Hasil : "+hasil);
    String cek = hasil > 10 ? "Angka lebih dari 10" : "Angka kurang dari 10";
    System.Out.Println();
    System.Out.Println(cek);}}