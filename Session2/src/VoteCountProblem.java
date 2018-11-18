
public class VoteCountProblem {

	public static void main(String[] args) {
		
		// Model: Data Storage : Single Value Container
		// Storing data in SVC'c is OK for less regions, but as regions will increase data storage will become complex for us
		// Democratic Party
		int demVoteCountArizona = 126;
		int demVoteCountFlorida = 32;
		int demVoteCountVermont = 230;
		int demVoteCountTexas = 21;
		int demVoteCountGeorgia = 200;
		
		// Republican Party
		int repVoteCountArizona = 152;
		int repVoteCountFlorida = 85;
		int repVoteCountVermont = 121;
		int repVoteCountTexas = 215;
		int repVoteCountGeorgia = 13;
		
		// Controller : Logical
		int demVoteCount = 0;
		int repVoteCount = 0;
		// Solving problem in SVC'c is OK for less regions, but as regions will increase solving problem will become complex for us
		demVoteCount = demVoteCountArizona + demVoteCountFlorida + demVoteCountVermont + demVoteCountTexas + demVoteCountGeorgia;
		repVoteCount = repVoteCountArizona + repVoteCountFlorida + repVoteCountVermont + repVoteCountTexas + repVoteCountGeorgia;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party Won by "+(demVoteCount-repVoteCount)+" Votes");
		}else{
			System.out.println("Replublican Party Won by "+(repVoteCount-demVoteCount)+" Votes");
		}
		
		
		System.out.println("===================");
		
		// PS: When Regions will increase Data Storage in SVC's is no good !!
		
		// Multi Value Container
		// Solving Problem with Arrays:
		// Data Storage is now simplified !!
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		// Data Storage is even more simplified !!
		// 2-D Array
		int[][] votes = {
							{126, 32, 230, 21, 200},
							{152, 85, 121, 215, 13}
						};

		// Solve the same problem with 2-D Arrays
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		for(int vote : demVotes){
			demVoteCount = demVoteCount + vote;
		}
		
		for(int vote : repVotes){
			repVoteCount = repVoteCount + vote;
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party Won by "+(demVoteCount-repVoteCount)+" Votes");
		}else{
			System.out.println("Replublican Party Won by "+(repVoteCount-demVoteCount)+" Votes");
		}
		
		int[] a = {126, 32, 126, 21, 200};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] == a[j]){
					System.out.println("We found a repeated number: "+a[i]);
				}
			}
		}
		
		
	}
	
	

}
