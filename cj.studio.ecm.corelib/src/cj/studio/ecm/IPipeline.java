package cj.studio.ecm;
//管道。有上行管道和下行管道派生接口。
//阀门持有一个管道实例，管道组装多个阀门实例，每个阀门内可以持有一个独立的管道，也可与其它阀门共享管道。阀门将管道串连起来。阀门实现处理、外部通讯功能
//每个管道被一个阀持有，对于上行管道，它还拥有多个向上的阀，对于下行管道，其拥有多个下级的阀
public interface IPipeline {
	//管道的持有者
	IValve getOwner();
}
