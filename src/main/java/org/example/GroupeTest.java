package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class GroupeTest {
    private Admin admin;
    private Groupe group;
    private Publication post;
    private Comment coms;

    @Before
    public void setup() {
        admin = new Admin(1, "Admin", "admin@example.com");
        group = new Groupe("Groupe1", admin);
        post = new Publication("Hello World", admin, "test");
        coms = new Comment(1, admin, "test Comment");
    }

    @Test
    public void testCreatePost() {
        group.AddPublications(post);
        assertEquals(1, group.getTotalPosts());
    }

    @Test
    public void testAddComment() {
        post.AddComments(coms);
        assertEquals(1, post.getComments().size());
    }

    @Test
    public void testDeleteComment() {
        post.AddComments(coms);
        post.RemoveComments(coms);
        assertEquals(0, post.getComments().size());
    }

    @Test
    public void testDeletePost() {
        group.AddPublications(post);
        group.RemovePublications(post);
        assertEquals(0, group.getTotalPosts());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(2, "test", "test@example.com");
        group.AddUsers(user);
        assertTrue(group.containsUser(user));
        group.RemoveUsers(user);
        assertFalse(group.containsUser(user));
    }
}
