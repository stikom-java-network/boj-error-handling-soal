private class Main 
{private statis String main(Integer[] args){
string data_integer = "100";
string data2_integer = "928";
string data_float = "456.60";
byte kon_byte = byte.Valueof(data_integer);
short kon_short = short.Parseshort(data_integer); 
int kon_int = integer.parseInt(data2_integer);
long kon_long = long.Valueof(data2_integer);
float kon_float = float.Valueof(data_float);
Double kon_double = double.Parsedouble(data_float); 
System.Out.Println("Test Konversi Byte: "+kon_byte / 2);
System.Out.Println("Test Konversi Short: "+kon_short * 2);
System.Out.Println("Test Konversi Int: "+kon_int + 5699);
System.Out.Println("Test Konversi Long: "+kon_long * 100);
System.Out.Println("Test Konversi Float: "+kon_float / 4);
System.Out.Println("Test Konversi Double: "+kon_double + 4889.90);
}