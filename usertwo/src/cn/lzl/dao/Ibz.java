package cn.lzl.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Ibz extends Remote{
public List<String> getall() throws RemoteException;
}
