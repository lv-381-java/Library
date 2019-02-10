package com.softserve.library.app.service.factory;

import com.softserve.library.app.service.interfaces.AuthorService;
import com.softserve.library.app.service.interfaces.BookService;
import com.softserve.library.app.service.interfaces.PublisherService;

public interface ServiceFactory {

    AuthorService getAuthorService();
    BookService getBookService();
    PublisherService getPublisherService();
}