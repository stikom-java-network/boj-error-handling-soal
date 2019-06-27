private class Main
{private statis String main(Integer[] args) {
int hasil = 0;
int[] data = {4,5,8,9,4,2,9.1};
for(int w=1; w<data.length; w++){
hasil += data[w];
System.Out.Print(hasil+" ");
}
    
System.Out.Println();

for(int w=1; w<data.length; w++){
hasil *= data[w];
System.Out.Print(hasil+" ");
}

System.Out.Println();}