public class instrumenttester {
    public static void main(String[] args) {
    //buat object untuk instrument
    instrument a = new instrument("Guitar", 101.5);   
    instrument b = new instrument("Piano", 200.0);   
    instrument c = new instrument("Violin", 150.9);   
   
    a.type = "Guitar";  
    a.price = 101.5;  
    b.type = "Piano";  
    b.price = 200.0;  
    c.type = "Violin";  
    c.price = 150.9;  
    a.print();   
    b.print();   
    c.print();   
   
    // Membandingkan harga
    instrument palingMahal = null;  
    instrument palingMurah = null;  
   
    if (a.price > b.price && a.price > c.price) {  
       palingMahal = a;  
    } else if (b.price > a.price && b.price > c.price) {  
       palingMahal = b;  
    } else {  
       palingMahal = c;  
    }  
   
    if (a.price < b.price && a.price < c.price) {  
       palingMurah = a;  
    } else if (b.price < a.price && b.price < c.price) {  
       palingMurah = b;  
    } else {  
       palingMurah = c;  
    }  
   
    System.out.println("Alat musik paling mahal adalah " + palingMahal.type + " dengan harga " + palingMahal.price);  
    System.out.println("Alat musik paling murah adalah " + palingMurah.type + " dengan harga " + palingMurah.price);


 





    
        
    }
}
