/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.twittersimplificado.controllers.dto;

import java.util.List;

/**
 *
 * @author Pedro
 */
public record FeedDto(
        List<FeedItemDto> feedItens,
        int page,
        int pageSize,
        int totalPages,
        long totalElements) {
    
}
