package com.mydashboard.DashboardApplication.repositories;

import com.mydashboard.DashboardApplication.entities.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
