/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.math.BigDecimal;

public class veri {
    private String sayi1="0";
    private char islem='+';
    private String sayi2="0";
    private String sonuc;

    public String getSayi1() {
        return sayi1;
    }

    public void setSayi1(String sayi1) {
        this.sayi1 = sayi1;
    }

    public char getIslem() {
        return islem;
    }

    public void setIslem(char islem) {
        this.islem = islem;
    }

    public String getSayi2() {
        return sayi2;
    }

    public void setSayi2(String sayi2) {
        this.sayi2 = sayi2;
    }

    public String getSonuc() {
        return sonuc;
    }

    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }
	
    public void hesapla(){
		BigDecimal first=new BigDecimal(this.sayi1);
		BigDecimal second=new BigDecimal(this.sayi2);
		switch(this.islem){
		case'+':{
			this.sonuc=first.add(second).toString();
			break;
		}
		case'-':{
			this.sonuc=first.subtract(second).toString();
			break;
		}
		case'*':{
			this.sonuc=first.multiply(second).toString();
			break;
		}
		case'/':{
			if(second.doubleValue()==0){
				throw new RuntimeException("The dividend cannot be 0");
			}
			this.sonuc=first.divide(second,20,BigDecimal.ROUND_HALF_UP).toString();
			break;
		}
		default:
			throw new RuntimeException("The operator can only be: +, -, *,/");
			
		}
        }
        
}
