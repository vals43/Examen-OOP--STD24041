package test;

import org.example.*;
import org.junit.*;

import static org.junit.Assert.*;

public class GroupeTest {
    private Admin admin;
    private Groupe group;
    private Publication publication;
    private Comment coms;

    @Before
    public void setup() {
        admin = new Admin("1", "Admin", "admin@example.com");
        group = new Groupe("Groupe1", admin);
        publication = new Publication("Hello World", admin, "test");
        coms = new Comment(1, admin, "test Comment");
    }

    @Test
    public void testCreatePublication() {
        group.AddPublications(publication);
        assertEquals(1, group.getTotalPublications());
    }

    @Test
    public void testAddComment() {
        admin.AddComment(publication, coms);
        assertEquals(1, publication.getComments().size());
    }

    @Test
    public void testDeleteComment() {
        admin.AddComment(publication,coms);
        admin.deleteComment(publication,coms);
        assertEquals(0, publication.getComments().size());
    }

    @Test
    public void testDeletePublication() {
        group.AddPublications(publication);
        group.RemovePublications(publication);
        assertEquals(0, group.getTotalPublications());
    }

    @Test
    public void testDeleteUser() {
        User user = new User("2", "test", "test@example.com");
        group.AddUsers(user);
        assertTrue(group.containsUser(user));
        group.RemoveUsers(user);
        assertFalse(group.containsUser(user));
    }
}
