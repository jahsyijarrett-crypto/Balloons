public class BalloonRunner 
{
    public static void main(String[] args) 
    {
        // Create two balloon objects
        Balloon ball1 = new Balloon(3.5, "Blue");
        Balloon ball2 = new Balloon(0, "Red");
        
        
        // Print out initial information of each balloon
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        

        // Inflate first balloon
         ball1.inflate(10);
        // Change the color of second balloon
        ball2.changeColor("purple");

        // Print out final information of each balloon
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
                
    }
}