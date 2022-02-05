package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
   public static List<Advert> advertList;
   public static List<Message> messageList;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Realestate realestate1=new Realestate("İstanbul","Ümraniye","Villa","5+1",200,0,false);
		Realestate realestate2=new Realestate("İstanbul","Pendik","Daire","3+1",150,3,true);
		Realestate realestate3=new Realestate("İzmir","Konak","Daire","2+1",100,4,false);
		Realestate realestate4=new Realestate("Muğla","Marmaris","Villa","4+1",300,0,false);
		Realestate realestate5=new Realestate("Eskişehir","Merkez","Daire","2+1",120,1,false);
		
		
		User user1=new User("Bireysel", "Sinan", "sinanaykin@gmailcom","https:/5d-b2e9-664cc9200cdc.jpg","Öğrenci","57186203");
		User user2=new User("Bireysel", "Yusuf", "yusuf@gmailcom","https:/877-564-66544cc9200cdc.jpg","Öğretmen","98762319");
		User user3=new User("Kurumsal", "Ahmet", "ahmet@gmailcom","https:/554-564-66544cc9200cdc.jpg","Memur","45639875");
		
		Advert advert1=new Advert(realestate1,"Acil satılık",user1,makePictureList(),500000,30,false,false,"04-02-2022",true,"Satılık");	
		Advert advert2=new Advert(realestate2,"Acil kiralık",user2,makePictureList(),3000,30,false,false,"05-02-2022",true,"kiralık");			
		Advert advert3=new Advert(realestate3,"Acil satılık",user3,makePictureList(),700000,30,false,false,"06-02-2022",true,"Satılık");
		
	
		Message message1=new Message("Hala Kiralık mı","Bu evi kiralamak istiyorum","06-02-2022","06-02-2022",true,user3,user1);
		Message message2=new Message("Hala Satılık mı","Bu evi almak istiyorum","05-02-2022","05-02-2022",true,user2,user3);
		
		addFavouriteAdvert(user2,advert1);//Favori ilan metoduna kullaıcı ve ilan atadım
		addFavouriteAdvert(user2,advert2);
		addFavouriteAdvert(user1,advert3);
		
		addMessageBox(message2,user3);//kullanıcının mesaj kutusu için kullanıcı ve mesaj atadım.
		addMessageBox(message1,user2);
		
		user2.releaseAdvert.add(advert2);//Kullanıcın yayınladığı ilanlar için ilan atadım
		user1.releaseAdvert.add(advert1);
		user3.releaseAdvert.add(advert3);
		
		advertList=new ArrayList<Advert>();
		advertList.add(advert1); //Bütün ilanların listedi ekledim
		advertList.add(advert2);
		advertList.add(advert3);
		
		messageList=new ArrayList<Message>();
		messageList.add(message2);//Bütün mesajların listesini ekledim.
		messageList.add(message1);
		
		Advert adv= new Advert();
		adv=getAdverts("İstanbul","3+1",3000)[0];	 //metod için uygun şartları sağlamasını görmek adına verileri gönderdim liste dönüyor
		System.out.println("Şartları sağlayan ilan: "+ adv.getRealEstate().getProvince()+ " " + adv.getRealEstate().getDistrict()+" "+adv.getRealEstate().getRoomNumber()+ " "+adv.getPrice());
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		System.out.println("Sistemdeki bütün mesajlar");
	    getMessages();//bütün mesajları dönen metodu çağırdık
	  
	    System.out.println("---------------------------------------------------------------------------------------------------------");	    
	    Set<Advert> favAdv = getFavoriteAdverts(user2);
	    
	    System.out.println(user2.getMail()+"'in Favori İlanları");//kullanıcın favori ilanlarını döndüm burada da
	    for(Advert advert : favAdv) {
	    	System.out.println("İlan tipi: "+advert.getAdverType()+ " "+ " İl:" +advert.getRealEstate().getProvince()+" " + "İlçe:"+advert.getRealEstate().getDistrict());
	    }
	    
		
		
	}
	


	private static String[] makePictureList() {//resim listedi atadım
		String[] pictureList = new String[5];
		pictureList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		pictureList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return pictureList;
	}
	
	private static void addFavouriteAdvert(User user,Advert advert) {//Kullanıcının favori ilanını eklemek için yazdığım metod
		user.favoriteAdvert.add(advert);
	
	}
	
	private static Set<Advert> getFavoriteAdverts(User user) {//Kullanıcının favori ilanını çağırmak için yazdığım metod
		
		Set<Advert> favAdv= new HashSet<Advert>();
		
		for(Advert advert: advertList) {
			if(advert.getUser().getMail()==user.getMail()) {
				favAdv= user.favoriteAdvert;
			}
		}
		
		return favAdv;
	}
	
	private static void addMessageBox(Message message,User user) {//Kullanıcının mesajlarını eklemek için yazdığım metod
		user.MessageBox.add(message);
	}
	
	private static void getMessages()
	{
		for(Message message : messageList) {
			System.out.println("Title:" +message.getTitle() + "/" + "User:"+message.getBuyer().getName());
		}
	}
	

	private static Advert[] getAdverts(String province,String roomNumber,int price) {//İlanın Şartı sağladığını kontrol eden metodu yazdım
		
		Advert[] returnAdvertList=new Advert[10];
		int i=0;
		for (Advert advert : advertList) {
			if(advert.getRealEstate().getProvince()==province && advert.getRealEstate().getRoomNumber()==roomNumber && advert.getPrice()==3000) {
				returnAdvertList[i]=advert;
				i++;
			}
			
		}
		
		return returnAdvertList;
		
	}
	

}
