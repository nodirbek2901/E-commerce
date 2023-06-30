package uz.pdp.ecommerce.domain.dto.request;

import uz.pdp.ecommerce.domain.entity.enums.UserState;

public record UserStateDto(String chatId, UserState state) {
}
