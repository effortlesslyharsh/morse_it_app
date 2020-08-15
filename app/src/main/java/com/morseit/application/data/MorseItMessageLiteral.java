/*copyrght developedbyharsh@gmail.com*/
package com.morseit.application.data;


import lombok.Getter;
import lombok.Setter;
/**
 * @author Harsh Mishra
 * data model to handle the messages
 *
 */

@Getter
@Setter
public class MorseItMessageLiteral {
    private String plainMessageText;
    private String uuid;
    private String morseEncodedText;

}
