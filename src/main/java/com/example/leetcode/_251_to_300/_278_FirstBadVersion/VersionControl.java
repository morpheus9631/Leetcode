package com.example.leetcode._251_to_300._278_FirstBadVersion;

public class VersionControl
{
  int _FirstBadVersion = Integer.MAX_VALUE;
  
  public VersionControl(int first_bad_version)
  {
    this._FirstBadVersion = first_bad_version;
  }
  
  boolean isBadVersion(int version)
  {
    System.out.println(this._FirstBadVersion+", "+version);
    
    return (version == this._FirstBadVersion); 
  }
}
