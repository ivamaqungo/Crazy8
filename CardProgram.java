import java.util.Arrays;
import java.util.Scanner;
public class CardProgram{
    public static void main(String[] args){
        Card b = new Card();
		Player newplayer = new Player();
        Card a  = new Card(11,1);
		String [] deck = a.CreateDeck();
		//Scanner in = new Scanner(System.in);
        //System.out.println("Whatup my nigga, Wanna play some some crazy Eight, I know you do bro,press <y> or <n> to quit");
		//String ans = in.nextLine();
		//if (ans.equals("y")){
		System.out.println("here your deck");
		System.out.println(Arrays.toString(deck)+"\n");
		//System.out.println("Wanna shuffle? press <y>");
		//String ans2 = in.nextLine();
		//if (ans2.equals("y")){
		String [] assR = a.RiffleShuffle_Inner(deck);
		String [] L = a.RiffleShuffle_Outer(assR);
		String [] f_shuffle = a.Swap_shuffle(L);
		for(String c : f_shuffle){
			newplayer.receiveCards(c);
		}
		System.out.println(newplayer.toString());
		//String [] myCards = a.Deall(L); 
		//System.out.println(Arrays.toString(myCards));

			
	
		//System.out.println("\n heres your deck");
    }  
}