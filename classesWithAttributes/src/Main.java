public class Main {

    public static void main(String[] args) {
    Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
    product.setName("Laptop"); // Her iki şekilde de yapılabilir yada yukardaki bir string değişken üzerinden de yazdırılabilir.
    //product.id=1;
    product.setId(1);
    product.setDescription("Asus Laptop");
    product.setPrice(5000);
    product.setStockAmount(3);
    //product.getId(); // Bu ifade ile burda da prive olmasına rağmen okuyabilir.

    ProductManager productManager=new ProductManager();
    productManager.Add(product);
    System.out.println(product.getKod());

    /*System.out.println(product.name);
    System.out.println(onur);*/
    }
}
