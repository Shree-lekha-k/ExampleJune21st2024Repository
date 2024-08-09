package com.sgtest.returnvalue;
class Friend
{
    String[] getbestFriend()
    {
        String s[]={"varshu","vinni","Teja"};
        return s;
    }
}
public class BestFriend {
    public static void main(String args[])
    {
        Friend f=new Friend();
        String friend[]=f.getbestFriend();
        for(String name:friend)
        {
            System.out.println(name);
        }
    }
}
