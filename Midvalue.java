import java.util.Array;
public class Midvalue
{
public static void main(String args[])
{
int arr[]={45,35,56,67,78,89,78,12,20};
int last=arr.length-1;

int key=67;
int first=0;
int mid=first+last/2;
while( first <= last)
{
if ( arr[mid] < key )
{
System.out.println("Element found at index;" + mid);
break;
}
else(
last = mid - 1;
}
mid = (first + last)/2;
}
if (first>last)
{
System.out.println("Element not found!");
}
}
}