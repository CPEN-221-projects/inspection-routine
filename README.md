E-Liza is a robot that has been developed to protect artifacts in museums, and has been deployed at the Louvre to patrol the galleries at night. Imagine that the main exhibits are indexed 0 ... N-1 and that these artifacts are [somehow] arranged in clockwise order when going from smaller index to a higher index, and in a circular layout. E-Liza can do a complete sweep of the galleries by starting at 0 and inspecting each of the artifacts and returning to 0 along the circle. E-Liza’s patrolling routine can be programmed by providing a sequence of ints.

When c is the current position and x is the next int in the command sequence that needs to be processed:

    if x > 0 then E-Liza should inspect the next x artifacts in clockwise direction;
    if x < 0 then E-Liza should inspect the next x artifacts but in anti-clockwise direction.

An additional integer repetitions specifies how many times E-Liza should repeat the sequence, always starting from where the previous iteration of the sequence took her.

E-Liza always starts her patrol by inspecting artifact 0.

Given the number of artifacts N, a [command] sequence to guide the inspections, and the repetitions, determine how many times each artifact is inspected. You have to return an array of length N where the i-th element represents the number of times artifact i was inspected.
