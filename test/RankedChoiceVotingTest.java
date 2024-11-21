//Ellie Do
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RankedChoiceVotingTest {

	@Test
	void testOneCandidate() {
		
		Election election = RankedChoiceVoting.initializeElection("Test3.txt");
		assertEquals("Ellie", election.selectWinner().get(0));
	}
	
	@Test
	void testMajorityWin() {
		Election election= RankedChoiceVoting.initializeElection("Test4.txt");
		assertEquals("MyAnh", election.selectWinner().get(0));
	}
	
	@Test
	void testTieFirstTime() {
		Election election= RankedChoiceVoting.initializeElection("Test5.txt");
		assertEquals("Ellie",election.selectWinner().get(0));
		assertEquals("Lee", election.selectWinner().get(1));
		assertEquals("MyAnh",election.selectWinner().get(2));
		
			
		}
	
	@Test
	void testEliminateTwoCandidatesDifferentRounds () {
		Election election=RankedChoiceVoting.initializeElection("Test6.txt");
		assertEquals("Ellie",election.selectWinner().get(0));
		
	}
	
	@Test
	void testEliminateTwoCandidatesAtATime() {
		Election election=RankedChoiceVoting.initializeElection("Test7.txt");
		assertEquals("Ellie",election.selectWinner().get(0));
		assertEquals("Lee",election.selectWinner().get(1));
	}
	
	@Test
	void testTwoCanddidatesOneBallot (){
		Election election=RankedChoiceVoting.initializeElection("Test8.txt");
		assertEquals("Ellie", election.selectWinner().get(0));
	}
	
	@Test
	void testMultipleRoundElimination() {
		Election election=RankedChoiceVoting.initializeElection("Test9.txt");
		assertEquals("Ellie", election.selectWinner().get(0));
	}
	
	@Test
	void testNoCandidate() {
		Election election=RankedChoiceVoting.initializeElection("Test10.txt");
		assertEquals(null, election);
	}
	
	@Test
	void testAllVotesOneCandidate() {
		Election election=RankedChoiceVoting.initializeElection("Test11.txt");
		assertEquals("MyAnh", election.selectWinner().get(0));
		
	}
	
	@Test
	void testOneCandidateMultipleBallots() {
		Election election=RankedChoiceVoting.initializeElection("Test12.txt");
		assertEquals("Michelle", election.selectWinner().get(0));
	}
	
	}


