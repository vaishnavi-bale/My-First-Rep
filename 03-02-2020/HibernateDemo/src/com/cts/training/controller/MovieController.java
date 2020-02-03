package com.cts.training.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class MovieController {
	public static void main(String ar[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Movie m = new Movie();
		m.setMname("xyz");

		Actor a = new Actor();
		a.setActorName("pqr");
		a.setMovie(m);
		Actor a2 = new Actor();
		a2.setActorName("bcd");
		a2.setMovie(m);

		session.save(m);
		session.save(a);
		session.save(a2);
		Criteria criteria = session.createCriteria(Actor.class);
		criteria.add(Restrictions.eq("actorName", "pqr"));
		Actor actor = (Actor) criteria.uniqueResult();
		System.out.println(actor);
		System.out.println(actor.getMovie().getMname());

		List<Actor> actors = criteria.add(Restrictions.eq("actorName", "pqr")).list();

		for (Actor act : actors)
			System.out.println(act.getMovie().getMname());

		tx.commit();
		session.close();
	}
}
