package staticConcept;

public class StaticConcept{
        private static int b=2;

        public static int getVariable()
        {
            return b;
        }

        public static void main(String[] args) {
            StaticConcept h=new StaticConcept();
            int c=h.getVariable();

            System.out.println("Static variable = "+c);

        }
}

