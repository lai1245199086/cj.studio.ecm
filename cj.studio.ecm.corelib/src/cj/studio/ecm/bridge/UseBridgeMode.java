package cj.studio.ecm.bridge;
/**
 * 通过属性引用对方服务的桥接模式
 * <pre>
 * 
 * </pre>
 * @author carocean
 *
 */
public enum UseBridgeMode {
	/**
	 * 自动适配引用的服务
	 * <pre>
	 * －如果对方有桥声明或已引用到桥实例，则桥接到对方，否则不使用桥接，即便配置了私有方面也无效
	 * －如果当前属性配置了私有方面，而对方是桥，则重新拼合方面，且属性的私有方面优先
	 * －该模式只是提供了一种在桥接时能指定私有的方面，没有此机制的话
	 * </pre>
	 */
	auto, 
	/**
	 * 禁止桥接到引用的服务
	 * <pre>
	 * －对方无论是否已是桥服务（但必须是适配器），当前属性均引用对方服务的真实对象。
	 * </pre>
	 */
	forbidden, 
	/**
	 * 属性的常规引用，不做任何有关桥接方面的处理，直接获取对方服务，如果对方服务即是桥，一样引用。
	 * <br>
	 * 在该模式下，注解cjjoinpoint失效
	 */
	normal
}
