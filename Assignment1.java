import java.io.*;

/**
   This program opens a binary file, reads
   and displays the contents.
*/

public class Assignment1
{
public static void main(String[] args)
throws IOException
{
// A number read from the file
int num;
// EOF flag
boolean endOfFile = false;
// Create the binary file input objects.
FileInputStream fstream =
new FileInputStream("Numbers.bin");
DataInputStream inputFile =
new DataInputStream(fstream);
System.out.println("Reading numbers from the file:");
// Read the contents of the file.
while(!endOfFile)
{
try
{
//get Int
num=inputFile.readInt();
//No neg,use abs val
int tmp=Math.abs(num);
String str="";
 while(tmp!=0)
{
//main binary conv
int result=tmp%2;
str = result+str;
tmp=tmp/2;
}
//Needs to be 32 char
int length=str.length();
length=31-length;
if(length>0)
{
for(int y=0;y<length;y++)
{
//pad with 0s
str="0"+str;
}
}
if(num>0)
{
str="0"+str;
}
else
{
str="1"+str;
}
//Binary Printout
//String b=Integer.toBinaryString(num);
//System.out.printf("%.32s",num);
 System.out.printf("%s\n",str);
//Hex Printout
 System.out.printf("%08x\n",num);
//5Bit
//get 5 bits
String Num2=str.substring(11,16);
int count=0;
for(int z=4;z>=0;z--)
{
//conversion
int p=Integer.parseInt(Num2.substring(4-z,5-z));
if(p==1)
{
int place=(int)Math.pow(2,z);
 count+=place;
}
}
//print 5bit
System.out.printf("%s\n",count);
//16bit
//get 16 bits
String Num3=str.substring(15,32);
int count2=0;
for(int v=15;v>=0;v--)
{
int p2=Integer.parseInt(Num3.substring(15-v+1,16-v+1));
//conversion
if(p2==1)
{
int place2=(int)Math.pow(2,v);
count2+=p2;
}
}
//print 16bit
System.out.printf("%s\n",count2);
System.out.println("New Number");
}
catch(EOFException e)
{
endOfFile=true;
}
}
System.out.println("\nDone.");
// Close the file.
inputFile.close();
}
}