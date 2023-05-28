package uz.pdp.entity.server.record;

import uz.pdp.entity.server.enums.Language;

public  record BookDTO (String title, String author, Language language,
                              Double price, Integer year){
}
