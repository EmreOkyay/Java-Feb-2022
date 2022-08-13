/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Bir kesri temsil eden MutableFraction isimli sınıfı aşağıdaki açıklamalara göre yazınız
	Açıklamalar:
	- Sınıf Matematikteki bir kesri temsil ettiğinden pay ve payda değerleri tutulacaktır

	- Sınıfın ilgili set ve get metotları yazılacaktır

	- Pay'ın sıfırdan farklı, paydanın sıfır olması durumunda tanımsızlığa ilişkin bir mesaj verilecektir, pay ve paydanın
	her ikisinin birden sıfır olması durumunda belirsizliğe ilişkin mesaj verilecektir. Her iki durumda da program
	sonlandırılacaktır

	- Kesir her durumda sadeleşmiş bir biçimde tutulacaktır. Örneğin kesrin pay ve paydası sırasıyla 4 ve 18 olarak
	verildiğinde kesir 2 / 9 olarak tutulacaktır.

	- Kesir negatif ise işaret payda bulunacaktır. Örneğin kesrin pay ve paydası sırasıyla 3 ve -4 olarak verilmişse
	kesir -3 / 4 biçiminde tutulacaktır

	- Kesrin pay ve paydasının ikisinin birden negatif olması durumunda kesir pozitif olarak tutulacaktır

	- Kesrin payının sıfır olması durumunda payda ne olursa olsun 1(bir) yapılacaktır

	- Sınıfın iki kesri toplayan, bir kesir ile bir tamsayıyı toplayan aşağıdaki gibi metotları olacaktır. Aynı işlemler
	 çıkarma, çarpma ve bölme için de yapılacaktır

	- Sınıfın kesri 1(bir) artıran ve bir azaltan inc ve dec metotları yazılacaktır

	- Sınıfın toString metodu şu formatta yazı döndürecektir:
	    3 / 10 kesri için -> 3 / 10 = 3.333333
	    10 / 1 kesri için -> 10

	 - Sınıfın public bölümünü değiştirmeden istediğiniz değişikliği ve eklemeleri yapabilirsiniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.MutableFraction;

class App {
	public static void main(String [] args)
	{
		MutableFraction mf = new MutableFraction(18, 27);

		System.out.println(mf.toString());

		mf.setNumerator(0);
		System.out.println(mf.toString());
	}
}

