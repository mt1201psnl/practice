package test;

import java.util.HashMap;

public abstract class AbstractService {

    abstract void execute();

    HashMap<String, SuperMemberVo> memberMap = new HashMap<String, SuperMemberVo>();

}
