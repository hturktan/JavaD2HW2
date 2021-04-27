package JavaD2HW2;

public class Main {

	public static void main(String[] args) {
		 sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi: sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if(varMi){
        	mesaj = "Sayý mevcuttur: "+aranacak;
            mesajVer(mesaj);
        }else{
            System.out.println("Sayý mevcut deðildir");
        }
        
	}

	public static void mesajVer(String mesaj) { // parametreli fonksiyon. 
		System.out.println(mesaj);
	}
	
}
