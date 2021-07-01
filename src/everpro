package myever;

import java.util.ArrayList;
import everland.input_data;

public class everpro {
	everdata data = new everdata();
	everland land = new everland();
	everarray arr = new everarray();
	
public ArrayList<input_data> input = new ArrayList<input_data>();

public int date = 0;
public int result = 0;
public int ea;
public int ordercount = 0;
public int user_id;
public String ticket;
public String human;
public String woodea;
public int discount;
	
    public void tick(int date) {
    	
    	if(210101 <= date && date<= 210431) {
			ticket="티켓 b";
			} else if(210501 <= date && date<= 210831) {
			ticket ="티켓 a";
			} else if(210901 <= date && date<= 211231) {
			ticket="티켓 c";
			} 
		
		if(ticket == "티켓 a") {
		result=+10000;
		} else if(ticket == "티켓 b") {
		result=+11000;
		} else {
		result=+12000;
		}
		

    }
	public void age(int user_id) {
		
		if (user_id >= 20) {
			result+=20000;
			human = data.adl;
			} else {
			result+=15000;
			human = data.kid;
			}
	}
	public void woo(int discount, int ea) {
		
		if(discount == 1) {
			result = (int) ((result * ea) * 1);
			woodea = "정상가";
			} else if(discount == 2) {
			result = (int) ((result * ea) * 0.8);
			woodea = "장애인 우대";
		    } else if(discount == 3) {
		    result = (int) ((result * ea) * 0.8);
		    woodea = "국가유공자 우대";
		    } else if(discount == 4) {
			result = (int) ((result * ea) * 0.8);
			woodea = "다자녀우대";
			} else {
			result = (int) ((result * ea) * 0.8);
			woodea = "임산부 우대";
			}
		
	}
	public void arrpro() {
		
		arr.savedate.add(date);
		arr.savehuman.add(human);
		arr.saveea.add(ea);
		arr.saveresult.add(result);
		arr.savewoodea.add(woodea);
		
	}
	public void print() {
		for(int index = 0; index <ordercount; index++) {
			System.out.println(ticket+ " 날짜:" + arr.savedate.get(index) + " " + arr.savehuman.get(index) + " X " + arr.saveea.get(index) +"명 "+ arr.saveresult.get(index) + "원 " + arr.savewoodea.get(index) + " 감사합니다");
			System.out.println("=============================================");
		}
	}
	}
