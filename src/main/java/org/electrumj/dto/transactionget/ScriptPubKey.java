package org.electrumj.dto.transactionget;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@JsonIgnoreProperties  
public class ScriptPubKey {
    private String asm;
    private String hex;
    private int reqSigs;
    private String type;
    private List<String> addresses;
    private String desc;
}
