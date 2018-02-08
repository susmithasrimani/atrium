package ch.tutteli.atrium.creating.iterable.contains.searchbehaviours

import ch.tutteli.atrium.creating.iterable.contains.builders.IterableContainsBuilder
import ch.tutteli.atrium.creating.throwUnsupportedOperationException

/**
 * A dummy implementation of [IIterableContainsSearchBehaviours] which should be replaced by an actual implementation.
 */
object IterableContainsSearchBehaviours : IIterableContainsSearchBehaviours {
    override fun <E, T : Iterable<E>> containsInAnyOrder(
        containsBuilder: IterableContainsBuilder<E, T, IterableContainsNoOpSearchBehaviour>
    ): IterableContainsBuilder<E, T, IterableContainsInAnyOrderSearchBehaviour> = throwUnsupportedOperationException()

    override fun <E, T : Iterable<E>> containsInAnyOrderOnly(
        containsBuilder: IterableContainsBuilder<E, T, IterableContainsInAnyOrderSearchBehaviour>
    ): IterableContainsBuilder<E, T, IterableContainsInAnyOrderOnlySearchBehaviour> =
        throwUnsupportedOperationException()

    override fun <E, T : Iterable<E>> containsInOrder(
        containsBuilder: IterableContainsBuilder<E, T, IterableContainsNoOpSearchBehaviour>
    ): IterableContainsBuilder<E, T, IterableContainsInOrderSearchBehaviour> = throwUnsupportedOperationException()

    override fun <E, T : Iterable<E>> containsInOrderOnly(
        containsBuilder: IterableContainsBuilder<E, T, IterableContainsInOrderSearchBehaviour>
    ): IterableContainsBuilder<E, T, IterableContainsInOrderOnlySearchBehaviour> = throwUnsupportedOperationException()
}
