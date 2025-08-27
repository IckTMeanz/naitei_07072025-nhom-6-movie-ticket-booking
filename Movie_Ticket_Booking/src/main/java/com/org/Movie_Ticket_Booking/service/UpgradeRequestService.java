package com.org.Movie_Ticket_Booking.service;

import com.org.Movie_Ticket_Booking.dto.request.UpgradeRqDTO;
import com.org.Movie_Ticket_Booking.dto.respone.UpgradeRqResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Locale;

public interface UpgradeRequestService {
    UpgradeRqResponse createUpgradeRequest(UpgradeRqDTO upgradeRqDTO);
    Page<UpgradeRqResponse> getAllRequest(Pageable pageable);
    Page<UpgradeRqResponse> getRequestsByStatus(String status, Pageable pageable);
    UpgradeRqResponse getDetailByID(Long id);
    void approve(Long id, Locale locale);
    void reject(Long id, Locale locale);
}
