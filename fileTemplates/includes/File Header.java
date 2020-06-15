
/**
 * @ClassName ${NAME}
 * @function [业务功能] 
 * @notice #if($NAME.contains('Api') || $NAME.contains('Controller')) 控制层只做入参出参处理 #elseif($NAME.contains('Service') || $NAME.contains('ServiceImpl'))针对原子操作的业务封装 #else 持久化操作不做业务上处理 #end
 
 * @Author lcz
 * @Date ${YEAR}/${MONTH}/${DAY} ${HOUR}:${MINUTE}
 */