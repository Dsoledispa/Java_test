public static void mast (String[] args){
    class primero {
        public class Mamifero{
            int numero_patas;
            public void mover( ){
            System.out.println("Un mamifero se mueve");
             }
        }

        class Perro extends Mamifero{
            public void mover( ){
            System.out.println("Un perro se mueve");
            }
        }

        class Gato extends Mamifero{
            public void mover( ){
            System.out.println("Un gato se mueve");
            }
        }
    }
}