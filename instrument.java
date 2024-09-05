public class instrument {
String type;
        double price;


        //constructor
        public instrument() {
            price = 0;
            type = "";
        }
        //constructor  parameter
        public instrument(String t, double p){
            this.type = t;
            this.price = p;
        }

            public void print() {
                System.out.println("type : " + type);
                System.out.println("price : " + price);
    
}
}