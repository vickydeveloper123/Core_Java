package com.google;

public class StringOperations {
	public static void main(String[] args) {

		String s = "Vignesh";// literals == equals
		String s1 = "Vignesh";

		String s2 = new String("Vignesh");// Value and Onject are not ame

		String s3 = new String("Vignesh");

		String s4 = new String("Xworkzz(BTM)");
		String s5 = new String("Xworkzz(BTM)");

		String s6 = new String("Bestie");

		String s7 = "Bestie";

		/*
		 * System.out.println(s == s1);// System.out.println(s.equals(s1));
		 * 
		 * 
		 * System.out.println(s1==s2);//False
		 * 
		 * System.out.println(s==s2);
		 * 
		 * System.out.println(s.equals(s2));//in the memory address the equls should
		 * consider the value not the memory addreess.
		 * 
		 * System.out.println(s1.equals(s2));
		 */
		/*
		 * System.out.println(s2==s3); System.out.println(s2.equals(s3));
		 */

		/*
		 * System.out.println(s4==s5);//FALSE,
		 * 
		 * System.out.println(s4.equals(s6));//false,false,false
		 */
		/*
		 * System.out.println(s6==s7);//false System.out.println(s6.equals(s7));//true
		 * 
		 * // intern method
		 * 
		 * System.out.println("==================Intern Method=============");
		 * 
		 * String v="SoftwareDevelopers"; String v1=new String("SoftwareDevelopers");
		 * 
		 * String v3=v.intern(); String v4=new
		 * String(v.intern());//"v("SoftwareDevelopers") String Constant value(memory
		 * address)
		 * 
		 * System.out.println(v==v3);// true,false,true
		 * System.out.println(v.equals(v3));//true,true,true
		 * 
		 * System.out.println("==========");
		 * 
		 * System.out.println(v3==v4);//true,true(false),false
		 * 
		 * System.out.println(v3.equals(v4));//true,true,true
		 */
		System.out.println("===============");

		String s11 = "Vignesh";

		String s21 = "Shwetha";

		String s31 = "Shashi";

		String s41 = "Shashi";

		System.out.println(s11.equals(s31));// false,false

		System.out.println(s31.equals(s41));// true,true

		String internn = s41.intern();// ==(Reward)//20+20

		System.out.println(internn);

		String internObject = new String(s11.intern());// false,true
		System.out.println(internObject);// (Reward)//20+20

		System.out.println(internn.equals(internObject));// flase,false

		System.out.println(internObject.equals(internn));

		System.out.println(internObject == s11);// 20+20=40

		System.out.println(internObject);
		System.out.println(s11);

		System.out.println(internn.equals(s31));

		// Why7 String is immutable

		/*
		 * String string="Shashi,Shwetha,vignesh@$^@gmail.com";
		 * 
		 * string=string+"=="+"Vignesh are good software Developers";
		 * 
		 * 
		 * 
		 * string=string+"Santosh";
		 * 
		 * String String1="Very Good Friends";
		 * 
		 * 
		 * 
		 * System.out.println(string);
		 * System.out.println(string.hashCode());//-1509391980
		 * 
		 * 
		 * String string1="Applications"; System.out.println(string1.hashCode());//
		 * 
		 * String s33=string1.concat(string);
		 * 
		 * System.out.println(s33);
		 * 
		 * 
		 * //passwords
		 * 
		 * System.out.println("===========Conact Method============");
		 * 
		 * System.out.println(string.concat(String1));
		 * 
		 * System.out.println("===========Hascode Address===========");
		 * 
		 * System.out.println(string.hashCode());
		 * System.out.println(String1.hashCode());
		 */
		/*
		 * System.out.println("=======Immutability===========");
		 * 
		 * String dude="Shwetha";
		 * 
		 * String dude1="shashi";
		 * 
		 * System.out.println(dude.concat("Vignesh and shwetha are also good developers"
		 * ));//shwetha Vignesh and shwetha are also good developers
		 * System.out.println(dude);
		 * 
		 * dude1=dude1+"Vignesh"+"Santhosh";
		 * 
		 * System.out.println(dude1);
		 * 
		 * System.out.println(dude.concat(dude1));
		 * 
		 */
		
		System.out.println("====Intern Method=========");
		
		String value="Bottle";
		
		String value2=value.intern();//Bottle == Bottle(value)
		
		String value3=new String("Today is so cool");
		
		String value4="Today is so cool";
		
		String value6=new String("Today is so cool");
		
		
		String value5=value3.intern();//Today is so cool
		
		System.out.println(value);
		System.out.println(value2);//
		
		System.out.println(value4);
		
		System.out.println(value3==value4);//true,false,true
		
		
		
		System.out.println(value3.hashCode());
		System.out.println(value4.hashCode());
		
		System.out.println(value3==value6);//
		/*
		 * System.out.println(value3.equals(value6));//true,
		 * 
		 * System.out.println(value3.hashCode());//530621430
		 * System.out.println(value6.hashCode());//530621430
		 * 
		 */
		
		System.out.println(value==value2);//
		System.out.println(value.equals(value2));//true
		
		System.out.println(value==value4);//false,
		
		System.out.println(value.equals(value4));//false 
		
		/*String val=new String("Good");
		String val2=new String("Goods");//68986678
		String val3=new String("Goods");//68986678
		System.out.println(val==val2);//only hascode
		
		System.out.println(val.equals(val2));//only value
		
		System.out.println(val.hashCode());
		System.out.println(val2.hashCode());
		System.out.println(val3.hashCode());
		
		System.out.println(val2.hashCode()==val3.hashCode());//value(hascode),objectrefer(hashcode)
		System.out.println(val2==val3);//false(here pointing to the hascode refernce).
		System.out.println(val2.equals(val3));//true();
*/		
		String call="JAVAA";//American standard code for information interchange
		String call2="JAVAa";
		String call3=new String("JAVA");
		String call4="javaa";
		
		System.out.println(call==call2);//true
		System.out.println(call.equals(call2));//true
		System.out.println(call2==call3);
		System.out.println(call2.equals(call3));//true
		
		System.out.println(call.hashCode());//2269730,70361695
		System.out.println(call2.hashCode());
		System.out.println(call3.hashCode());
		
		System.out.println(call==call2);//false
		
		System.out.println(call==call2);//false
		
		System.out.println(call.hashCode());
		System.out.println(call2.hashCode());
		
		
		
		
		
		
		
		
		
		
		

	}

}
