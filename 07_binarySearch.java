import java.util.*;
public class bs
{
public static void binarysearch(int arr[],int first,int last,int key)
{
int mid=(last+first)/2;
while(first<=last)
{
if(arr[mid]<key)
{
first=mid+1;
}
else if(arr[mid]==key)
{
System.out.println("Element is found at index:"+mid);
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last){
System.out.println("Element not found");
}
}
public static void main(String args[])
{
int arr[]={10,20,30,40,50};
int key=20;
int last=arr.length-1;
binarysearch(arr,0,last,key);
}
}
