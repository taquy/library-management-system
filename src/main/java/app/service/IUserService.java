package app.service;

import java.util.List;

import app.entity.Book;
import app.entity.Ticket;
import app.entity.User;

/*
 * Use cases: 13, 15, 16, 17, 18, 19
 */

public interface IUserService {
	// UC18
	void create(User user);

	// UC16
	void update(User user);

	// UC17
	void delete(long userId);

	// UC15
	List<User> list();

	// UC19
	User show(long userId);

	// UC13
	List<Book> viewBorrowedBooks(long borrowerId);

	// UC24
	List<Ticket> viewBorrowTickets(long borrowerId);
}