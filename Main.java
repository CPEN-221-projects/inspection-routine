public class Main {
    public static void main(String args[]) {
        int numArtifacts = 10;
        int repetitions = 3;
        int[] patrolSequence = {1, 2, 3};

        int[] output = InspectionRoutine.inspectionCount(numArtifacts, patrolSequence, repetitions);

        for (int i: output) {
            System.out.println(i);
        }

    }
}
