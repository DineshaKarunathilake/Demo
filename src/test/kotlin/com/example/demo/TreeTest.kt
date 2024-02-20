package com.example.demo


import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TreeTest {


    @Test
    fun `test tree traversal`() {
        val head = BinaryNode(15, BinaryNode(10), BinaryNode(18))

        val path = Tree().traverse(head)

        Assertions.assertThat(path.pop()).isEqualTo(18)
        Assertions.assertThat(path.pop()).isEqualTo(15)
        Assertions.assertThat(path.pop()).isEqualTo(10)
    }

    @Test
    fun `bfs tests`() {
        val head = BinaryNode(15, BinaryNode(10), BinaryNode(18))


        assertThat(Tree().bfs(head, 15)).isTrue()
        assertThat(Tree().bfs(head, 10)).isTrue()
        assertThat(Tree().bfs(head, 18)).isTrue()
        assertThat(Tree().bfs(head, 8)).isFalse()

        val head2 = BinaryNode(15, BinaryNode(10, BinaryNode(5), BinaryNode(4)), BinaryNode(18, BinaryNode(2), BinaryNode(3)))
        assertThat(Tree().bfs(head2, 15)).isTrue()
        assertThat(Tree().bfs(head2, 10)).isTrue()
        assertThat(Tree().bfs(head2, 18)).isTrue()
        assertThat(Tree().bfs(head2, 5)).isTrue()
        assertThat(Tree().bfs(head2, 3)).isTrue()
        assertThat(Tree().bfs(head2, 1)).isFalse()
    }

    @Test
    fun `compare tests`() {

        val nodeA = BinaryNode(15, BinaryNode(10), BinaryNode(18))
        val nodeB = BinaryNode(15, BinaryNode(10), BinaryNode(18))

        assertThat(Tree().compare(nodeA, nodeB)).isTrue()

        val nodeC = BinaryNode(15, BinaryNode(10, BinaryNode(18)) )

        assertThat(Tree().compare(nodeA, nodeC)).isFalse()

        val nodeD = BinaryNode(15, BinaryNode(10, BinaryNode(18)), BinaryNode(2) )

        assertThat(Tree().compare(nodeC, nodeD)).isFalse()
    }

    @Test
    fun `bst dfs find` () {

        val node = BinaryNode(15, BinaryNode(10, BinaryNode(5), BinaryNode(14)), BinaryNode(18))

        assertThat(Tree().bstDfsFind(node, 18)).isTrue()
        assertThat(Tree().bstDfsFind(node, 10)).isTrue()
        assertThat(Tree().bstDfsFind(node, 1)).isFalse()
        assertThat(Tree().bstDfsFind(node, 14)).isTrue()

    }

    @Test
    fun `bt insert` () {
        val node = BinaryNode(15, BinaryNode(10), BinaryNode(18))

        Tree().btInsert(node, 5)
        assertThat(Tree().bstDfsFind(node, 5)).isTrue()
        val nodeB = BinaryNode(15, BinaryNode(10, BinaryNode(5)), BinaryNode(18))
        assertThat(Tree().compare(node, nodeB)).isTrue()

        Tree().btInsert(node, 14)
        val nodeC = BinaryNode(15, BinaryNode(10, BinaryNode(5), BinaryNode(14)), BinaryNode(18))
        assertThat(Tree().bstDfsFind(node, 14)).isTrue()
        assertThat(Tree().compare(node, nodeC)).isTrue()
    }






}