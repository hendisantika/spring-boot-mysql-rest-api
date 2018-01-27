package com.hendisantika.springbootmysqlrestapi.repository;

import com.hendisantika.springbootmysqlrestapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mysql-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/01/18
 * Time: 19.12
 * To change this template use File | Settings | File Templates.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {
}
