public class superclass{
    void Super() {
        System.out.println( " super");

    }
        
    

    public static void abc(){
        System.out.println(" super classs");
    }

    public class subset{

        void hello (){
            System.out.println("xyz");

        }
        static  void xyz(){
            System.out.println(" sub class");
        }
        public class nestedclass{
            public static void nest(){

            
            System.out.println(" nested");
            }
        }
    }
}