class Char
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Desired character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Character you entered is a Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Character you entered is a Consonent");
		else
		System.out.println("Not an alphabet");		
	}
}
