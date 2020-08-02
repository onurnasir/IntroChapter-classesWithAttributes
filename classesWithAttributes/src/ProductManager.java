public class ProductManager {
    public void Add(Product product){ // Parametre verdik. Manager class'ında sadece ürünle ilgili operasyonlar olmalı.
        //JDBC kodları yazarak veri tabanına gönderebiliyoruz.
        System.out.println("Ürün eklendi:"+product.getName()); //referans değişkeni üzerinden ulaşabiliyoruz. Örn: string değişkeni yani onur üzerinden ulaşamadık.
    }

    public void Add2(int id,String name,String description,int stockAmount,double price){

    }

}
