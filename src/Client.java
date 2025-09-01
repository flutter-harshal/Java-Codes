 class Pro30 {
     private int jerNo;
     private String playerName;

     Pro30(int jerNo, String playerName) {
         this.jerNo = jerNo;
         this.playerName = playerName;
     }

      void info() {
         System.out.println(jerNo + " " + playerName);
     }

     public class client {
         public void main(String[] args) {
             Pro30 obj = new Pro30(45, "Ro");
             obj.info();
             Pro30 obj1 = new Pro30(45, "Ro");
             obj1.info();
             Pro30 obj2 = new Pro30(45, "Ro");
             obj2.info();

         }
     }
 }