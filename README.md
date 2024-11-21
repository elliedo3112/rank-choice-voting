# Ranked-Choice Voting Project

## Project Goal

This project implements a **Ranked-Choice Voting (RCV)** system, a voting method where voters rank candidates in order of preference. The project aims to simulate the RCV process, handle ballots programmatically, and determine the winner through iterative elimination of the lowest-ranked candidates. 

An emphasis is placed on creating a robust suite of test cases to ensure the correctness and reliability of the implementation across various edge cases and scenarios.

---

## Features

- **Vote Ranking**: Allows users to rank candidates by preference on each ballot.
- **Vote Counting**: This method counts first-choice votes and redistributes votes from eliminated candidates until a winner is determined.
- **Majority Check**: Verifies if any candidate has a majority of votes after each round.
- **Elimination**: Handles tie-breaking and eliminates candidates with the fewest votes.
- **Edge Case Handling**:
  - Detects invalid or incomplete ballots.
  - Handles ties and edge cases where multiple candidates share the lowest votes.

---

## Skills Involved

### 1. **Algorithm Design**
   - Implementing iterative rounds of vote counting and candidate elimination.
   - Handling tie-breaking and vote redistribution efficiently.

### 2. **Data Structures**
   - Storing and processing ballots using lists, dictionaries, or arrays.
   - Managing candidate data and vote counts dynamically throughout the process.

### 3. **Test Case Development**
   - Designing comprehensive test cases to ensure robustness, including:
     - Basic scenarios with a clear winner.
     - Edge cases, such as ties or invalid ballots.
     - Stress testing with large datasets.
   - Automating test cases to validate correctness after every iteration.

### 4. **Problem-Solving**
   - Debugging vote redistribution logic to ensure accuracy.
   - Identifying and resolving edge cases to make the implementation foolproof.

### 5. **Modular Programming**
   - Writing reusable functions, such as `countVotes()`, `eliminateCandidate()`, and `checkMajority()`.
   - Structuring the program to separate logic for vote counting, elimination, and result output.

---


