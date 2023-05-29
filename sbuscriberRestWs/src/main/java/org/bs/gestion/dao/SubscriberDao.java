package org.bs.gestion.dao;

import org.bs.gestion.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberDao extends JpaRepository<Subscriber, Long> {

}
