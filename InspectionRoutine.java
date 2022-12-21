public class InspectionRoutine {

    /**
     * Compute the number of times an artifact is inspected given a command sequence
     *
     * @param numArtifacts the number of artifacts in the museum, {@code numArtifacts > 0}
     * @param commands the commands for one iteration of inspections, {@code commands.length > 0}
     * @param repetitions the number of times the commands are to be repeated, {@code repetitions > 0}
     * @return the number of times each artifact is inspected
     *         (the entry at index i represents the number of times artifact i is inspected)
     */
    public static int[] inspectionCount(int numArtifacts, int[] commands, int repetitions) {
        // TODO: implement this method
        int[] inspectionTracker = new int[numArtifacts];
        int position = 0;

        inspectionTracker[0] = 1;

        for (int i = 0; i < repetitions; i++) {
            for (int n: commands) {
                for (int j = 0; j < Math.abs(n); j++) {
                    if (n > 0) {
                        position++;
                        if (position >= numArtifacts) {
                            position = 0;
                        }
                    } else {
                        position--;
                        if (position < 0) {
                            position = numArtifacts - 1;
                        }
                    }
                    inspectionTracker[position]++;
                }
            }
        }


        return inspectionTracker; // TODO: change this
    }
}