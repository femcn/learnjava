class StringBufferExample
{
    public static void main(String args[ ])
    {
        StringBuffer str=new StringBuffer("ABCDEFG");
        str.append("123456789");
        // System.out.println(str);
        str.replace(1,2,"b");
        str.insert(7,"Game");
        System.out.println(str);
        int index=str.indexOf("1");
        str.replace(11,14,"");
        int n=str.length();
        str.replace(14,17,"七八九");
        System.out.println(str);
        StringBuffer otherStr=new StringBuffer("we love you");
        int start=0;
        char c='\0';
        while(start!=-1)
        {
            if(start!=0)
            {
                start=start+1;
            }
            c=otherStr.charAt(start);
            if(Character.isLowerCase(c))
            {
            c=Character.toUpperCase(c);
            otherStr.setCharAt(start,c);
            }
            start=otherStr.indexOf(" ",start);
        }
        System.out.println(otherStr);
        StringBuffer yourStr=new StringBuffer("i Love THIS GaME");
        int start0=0;
        char c0='\0';
        while(start0<=15)
        {
            c0=yourStr.charAt(start0);
            if(Character.isLowerCase(c0))
            {
                c0=Character.toUpperCase(c0);
                yourStr.setCharAt(start0,c0);
            }
            else
                {
                c0=Character.toLowerCase(c0);
                yourStr.setCharAt(start0,c0);
                }
            start0=start0+1;
        }
        System.out.println(yourStr);
    }
  }